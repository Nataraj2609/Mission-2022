package fileReading.FreshWorks.Educative.MergeInterval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class MergeInterval {

  public static List<Interval> merge(List<Interval> intervals) {
    if (intervals.size() < 2) {
      return intervals;
    }
    List<Interval> mergedIntervals = new LinkedList<>();

    //Step 1 Sort
    Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

    Iterator<Interval> intervalsIterator = intervals.iterator();
    Interval interval = intervalsIterator.next();
    int a_start = interval.start;
    int a_end = interval.end;

    while (intervalsIterator.hasNext()) {
      Interval b_interval = intervalsIterator.next();
      // Step 2 do a overlaps b? b.start <= a.end ?
      if (b_interval.start <= a_end) { // If yes
        a_end = Math.max(a_end, b_interval.end);
      } else { // No Overlap
        mergedIntervals.add(new Interval(a_start, a_end));
        a_start = b_interval.start;
        a_end = b_interval.end;
      }
    }

    mergedIntervals.add(new Interval(a_start, a_end));

    return mergedIntervals;
  }

  public static void main(String[] args) {
    List<Interval> input = new ArrayList<>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 5));
    input.add(new Interval(7, 9));
    System.out.print("Merged intervals: ");
    for (Interval interval : merge(input)) {
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    }
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(6, 7));
    input.add(new Interval(2, 4));
    input.add(new Interval(5, 9));
    System.out.print("Merged intervals: ");
    for (Interval interval : merge(input)) {
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    }
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 6));
    input.add(new Interval(3, 5));
    System.out.print("Merged intervals: ");
    for (Interval interval : merge(input)) {
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    }
    System.out.println();
  }
}