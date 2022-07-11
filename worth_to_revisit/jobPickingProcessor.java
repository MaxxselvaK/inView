package worth_to_revisit;
/*
Given n tasks with [enqueTimei, ProcessingTimei]
it the tasks started processing it cannot be killed. the processor will take the smallest processing time task first. if two task has
same processing time then it will pick the smallest index task.
return the order of the tasks execution

eg) {[1,5],[2,4],[3,5],[4,1],[5,2]}
output : [0,2,3,1] - 0th task picked first due to other task are not available at that enque time.


input {[7,10][7,12],[7,5],[7,4],[7,2]}
output : [4,3,2,0,1]


solution:
    add all the task has the same smallest enque time task to the q. sort the queue based on the processing time.
    process the first task, after processing add the newly waiting tasks to the queue and sort it again.
    do this process repeatedly to solve.
 */
public class jobPickingProcessor {
    class process{
        int enqueTime;
        int processingTime;
        process(int q,int p){
            this.enqueTime=q;
            this.processingTime=p;
        }
    }
    public static void main(String[] args) {

    }
}
