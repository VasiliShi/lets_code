package lets.code.every.day;

public class LinkedList {
	class Node 
	{
		// ע���˴���������Ա����Ȩ�޲���Ϊprivate����Ϊprivate��Ȩ���ǽ��Ա�����ʡ�
		int data; // ������
		Node next;// ָ����
		
		public Node(int data) 
		{
			this.data = data;
		}
	}
	public Node head;
	public Node current;
	//���
	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			current = head;
		} else {
			current.next = new Node(data);
			current = current.next; 
		}
	}
	//���
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
	//����
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
	//ɾ��
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
			//ָ��Ҫɾ���ڵ��ǰһ��
			while(current.next != null && current.next.data != value)
				current = current.next;
			toBeDel = current;
			current.next = current.next.next;
		}
		if(toBeDel != null)
			toBeDel = null;
	}
	//���ҵ�����K��Ԫ��
	public int findKth2Tail(Node head,int k)
	{	
		//��Ҫע��
		if(k > length(head) || k == 0 ||head == null)
			return 0;
		Node pa = head,pb = head;
		//ע�⣬������K��Ԫ�أ�pa��Ҫ����k-1��
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
	//�����м�
	public int findMidNode(Node head)
	{
		if(head == null)
			return 0;
		Node pa = head;
		Node pb = head;
		//ע�⣬��Ҫ��pb�ж�����
		while(pb != null && pb.next != null)
		{
			pa = pa.next; //һ��
			pb = pb.next.next; //����
		}
		return pa.data;
	}
	/**
	 * ��������˼·���µ�ͷ���head������ƶ����ı�ԭ�����ӷ���a->b->c
	 * a<-b<-c
	 * @param head
	 * @return
	 */
	public Node reverse(Node head)
	{
		Node current = head;
		Node prev = null; //���ǰһ���ڵ�
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
	//ͷ�巨����
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
	 * ʹ�õݹ���ʽ  ����
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
	 * �ϲ��Ѿ��������������������Ȼ����
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
		
		{//��������
			for (int i = 0; i < 10; i++) 
			{
				list.add(i);
			}
		}
		list.print(list.head);// ��head�ڵ㿪ʼ�������
		
		{// remove test
			list.removeNode(list.head, 9);
			list.print(list.head);
		}
		{//findMidNode
			int mid = list.findMidNode(list.head);
			System.out.println(mid);
		}
		{//reverse linkedlist
//			list.reverseInsertHead(list.head);//ͷ�巨����ͷ��λ�ò���
//			list.print(list.head);
			list.print(list.reverse(list.head));
			//list.print(list.recursionReverse(list.head));
		}
	}

}