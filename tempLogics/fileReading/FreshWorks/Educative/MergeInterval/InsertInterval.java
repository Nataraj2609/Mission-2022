package fileReading.FreshWorks.Educative.MergeInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
  public static void main(String[] args) {
    List<Interval> input = new ArrayList<Interval>();
    input.add(new Interval(1, 3));
    input.add(new Interval(5, 7));
    input.add(new Interval(8, 12));
    System.out.print("Intervals after inserting the new interval: ");
    for (Interval interval : insert(input, new Interval(4, 6))) {
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    }
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(1, 3));
    input.add(new Interval(5, 7));
    input.add(new Interval(8, 12));
    System.out.print("Intervals after inserting the new interval: ");
    for (Interval interval : insert(input, new Interval(4, 10))) {
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    }
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(2, 3));
    input.add(new Interval(5, 7));
    System.out.print("Intervals after inserting the new interval: ");
    for (Interval interval : insert(input, new Interval(1, 4))) {
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    }
    System.out.println();
  }

  // It is sorted by default
  private static Iterable<? extends Interval> insert(List<Interval> intervalList, Interval newInterval) {
    if (intervalList == null || intervalList.isEmpty())
      return Arrays.asList(newInterval);

    int i = 0;
    List<Interval> mergedInterval = new ArrayList<>();

    while (i < intervalList.size() && intervalList.get(i).end < newInterval.start) {
      mergedInterval.add(intervalList.get(i));
      i++;
    }

    while (i < intervalList.size() && intervalList.get(i).end >= newInterval.start) {
      Interval c_interval = new Interval(
        Math.min(intervalList.get(i).start, newInterval.start),
        Math.max(intervalList.get(i).end, newInterval.end));
      mergedInterval.add(c_interval);
      i++;
    }

    while (i < intervalList.size()) {
      mergedInterval.add(intervalList.get(i));
      i++;
    }

    return mergedInterval;
  }
}
