package solution;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {

	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		
		List<Interval> A = new LinkedList<Interval>();
		A.add(new Interval(1, 3));
		A.add(new Interval(2, 6));
		A.add(new Interval(8, 10));
		A.add(new Interval(15, 18));
		
		for(Interval i : sol.merge(A)){
			System.out.println(this.output(i));
		}
    }
	
	private String output(Interval interval){
		return interval.start + " " + interval.end;
	}
}
