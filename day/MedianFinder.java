package lets.code.every.day;


import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

	public PriorityQueue<Integer> minheap, maxheap;
    public MedianFinder() {
        maxheap = new PriorityQueue<Integer>();
        
        minheap = new PriorityQueue<Integer>(10,Collections.reverseOrder());
    }
    
    // Adds a number into the data structure.
    public void addNum(int num) {
        maxheap.add(num);
        minheap.add(maxheap.poll());
        if (maxheap.size() < minheap.size()) {
            maxheap.add(minheap.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (maxheap.size() == minheap.size()) {
            return (maxheap.peek() + minheap.peek()) * 0.5;
        } else {
            return maxheap.peek();
        }
    }
	public static void main(String[] args) {
		MedianFinder mf = new MedianFinder();
		mf.addNum(1);
		mf.addNum(6);
		mf.addNum(4);
		mf.addNum(5);
		System.out.println(mf.findMedian());
		
		
		PriorityQueue maxheap = new PriorityQueue<Integer>(10,Collections.reverseOrder());
		maxheap.add(3);
		maxheap.add(1);
		maxheap.add(5);
		System.out.println(maxheap);
	}

}
