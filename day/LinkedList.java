package lets.code.every.day;

public class LinkedList {
	class Node 
	{
		// 注：此处的两个成员变量权限不能为private，因为private的权限是仅对本类访问。
		int data; // 数据域
		Node next;// 指针域
		
		public Node(int data) 
		{
			this.data = data;
		}
	}
	public Node head;
	public Node current;
	//添加
	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			current = head;
		} else {
			current.next = new Node(data);
			current = current.next; 
		}
	}
	//输出
	public void print(Node node) {
		if (node == null) {
			return;
		}
		current = node;
		while (current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	//长度
	public int length(Node head)
	{
		if (head == null)
			return 0;
		int length = 0;
		current = head;
		while(current != null)
		{
			length ++;
			current = current.next;
		}
		return length;
	}
	//删除
	public void removeNode(Node head,int value)
	{
		if(head == null)
			return;
		Node toBeDel = null;
		if(head.data == value)
		{
			toBeDel = head;
			head = head.next;
		}
		else
		{	
		    current = head;
			//指向要删除节点的前一个
			while(current.next != null && current.next.data != value)
				current = current.next;
			toBeDel = current;
			current.next = current.next.next;
		}
		if(toBeDel != null)
			toBeDel = null;
	}
	//查找倒数第K个元素
	public int findKth2Tail(Node head,int k)
	{	
		//需要注意
		if(k > length(head) || k == 0 ||head == null)
			return 0;
		Node pa = head,pb = head;
		//注意，倒数第K个元素，pa需要先走k-1步
		for(int i = 0; i < k - 1; i++)
		{
			pa = pa.next;
			if(pa == null)
				return 0;
		}
		while(pa.next != null)
		{
			pa = pa.next;
			pb = pb.next;
		}
		return pb.data;
	}
	//查找中间
	public int findMidNode(Node head)
	{
		if(head == null)
			return 0;
		Node pa = head;
		Node pb = head;
		//注意，需要对pb判断两次
		while(pb != null && pb.next != null)
		{
			pa = pa.next; //一步
			pb = pb.next.next; //两步
		}
		return pa.data;
	}
	/**
	 * 逆序链表，思路是新的头结点head，向后移动，改变原来链接方向a->b->c
	 * a<-b<-c
	 * @param head
	 * @return
	 */
	public Node reverse(Node head)
	{
		Node current = head;
		Node prev = null; //存放前一个节点
		Node reverseHead = null;
		Node next = null;
		while(current != null)
		{
			next = current.next;
			if(next == null)
				reverseHead = current;
			current.next = prev;
			
			prev = current;
			current = next;
		}
		return reverseHead;
	}
	//头插法逆序
	public void reverseInsertHead(Node head)
	{
		Node p = head.next;
		Node q = null;
		head.next = null;
		while(p != null)
		{
			q = p.next;
			p.next = head.next;
			head.next = p;
			p = q;
		}
	}
	/**
	 * 使用递归形式  逆序
	 * @param head
	 * @return
	 */
	public Node  recursionReverse(Node head)
	{
		if(head == null)
			return null;
		Node current = null,reverseHead=null,tmp = null;
		if(head.next == null)
			return head;
		else
		{
			current = head;
			tmp = head.next;
			reverseHead = recursionReverse(tmp);
			tmp.next = current;
			current.next = null;
		}
		return reverseHead;
	}
	/**
	 * 合并已经排序的链表，，新链表仍然有序
	 * @param h1
	 * @param h2
	 * @return
	 */
	public Node merge(Node h1,Node h2)
	{
		if(h1 == null)
			return h2;
		if(h2 == null)
			return h1;
		Node head = null;
		if(h1.data > h2.data)
		{
			head = h2;
			head.next = merge(h1, h2.next);
		}
		else
		{
			head = h1;
			head.next = merge(h1.next,h2);
		}
		return head;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		{//建立链表
			for (int i = 0; i < 10; i++) 
			{
				list.add(i);
			}
		}
		list.print(list.head);// 从head节点开始遍历输出
		
		{// remove test
			list.removeNode(list.head, 9);
			list.print(list.head);
		}
		{//findMidNode
			int mid = list.findMidNode(list.head);
			System.out.println(mid);
		}
		{//reverse linkedlist
//			list.reverseInsertHead(list.head);//头插法逆序，头的位置不变
//			list.print(list.head);
			list.print(list.reverse(list.head));
			//list.print(list.recursionReverse(list.head));
		}
	}

}