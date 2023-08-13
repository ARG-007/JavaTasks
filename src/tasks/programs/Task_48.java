package tasks.programs;

import java.util.Arrays;

import tasks.interfaces.TASK;

public class Task_48 implements TASK {

    public Task_48(){
        showDetails(getID(), getDescription());
    }

    public int getID() {
        return 48;
    }

    public String getDescription() {
          return "Merge Intervals";
    }

    private static class Interval implements Comparable<Interval> {
        public int start,end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Interval o) {
            if(this.end<o.start && this.end<o.end)
                return -1;
            if(this.end==o.start)
                return 0;
            return 1;
        }

        public String toString(){
            return String.format("{ %d - %d }", start, end);
        }
        
    }


    @Override
    public void execute() {
        // int size = toInt(input("Size: "));
        // Interval[] intervals = new Interval[size];

        // for(int i=0;i<size;i++) {
        //     intervals[i] = new Interval(input.nextInt(), input.nextInt());
        // }
        // input.nextLine();
        Interval[] intervals = new Interval[] {
            new Interval(1, 6),
            new Interval(5, 8),
            new Interval(2, 7),
            new Interval(4,9),
            new Interval(10,11)
        };

        Arrays.sort(intervals);

        System.out.println(Arrays.toString(intervals));
    }

    public static void main(String[] args) {
        new Task_48().execute();
    }
    
}
