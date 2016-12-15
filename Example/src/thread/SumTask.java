package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer> {

	 static final int CHUNK_SIZE = 3; // execution batch size;

	 Integer[] numbers;
	 int begin;
	 int end;

	 SumTask(Integer[] numbers, int begin, int end) {
	  this.numbers = numbers;
	  this.begin = begin;
	  this.end = end;
	 }

	 @Override
	 protected Integer compute() {
	  //sums the given number
	  if (end - begin <= CHUNK_SIZE) {
	    int sum = 0;
	    List<Integer> processedNumbers = new ArrayList<>();
	    for(int i=begin; i < end; ++i) {
	      processedNumbers.add(numbers[i]);//just to track
	      sum += numbers[i];
	    }

	    //tracking thread, numbers processed, and sum
	    System.out.println(Thread.currentThread().getName() + " proceesing " +
	      Arrays.asList(processedNumbers) +  ", sum = " + sum);
	    return sum;
	  }
	  
	  //create chunks, fork and join
	  else {
	    int mid = begin + (end - begin) / 2; //mid point to partition
	    SumTask left  = new SumTask(numbers, begin, mid);  //left partition
	    SumTask right = new SumTask(numbers, mid, end);    //right partition
	    left.fork();            //asynchronously execute on a separate thread
	    int leftAns = right.compute();                  //recurse and compute
	    int rightAns = left.join();  //returns the asynchronously executed result
	    System.out.println("leftAns=" + leftAns + " + " + "rightAns=" + rightAns);
	    return leftAns + rightAns;                         
	  }

	 }
	}
