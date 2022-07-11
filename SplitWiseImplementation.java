/* This is Np complete problem:
solution is not solvable in Polynomial problem but 
verifiable in Polynomial time.

P problem :
    problems is solvable in polynomial time
All problems are NP , P is subset of NP and NP hard also.
*/
class SplitWiseImplementation{
    class Transaction{
        Strig person1;
        String person2;
        int amount;
        public void Transaction(String p1,String p2,int m){
            person1 = p1;
            person2 = p2;
            amount = m;
        }
    }
    class netTransaction{
        String person;
        int amount;
    }
    public static int isNetContains(netTransaction[] net,String person){
        int len = net.length;
//        for(int i=0;i)
        return 0;
    }
    public static void main(String[] args){
//        Transaction[] trans = new Transaction[]{new Transaction("selva","maxx",100),new Transaction("maxx","mani",50),new Transaction("maxx","maha",50),new Transaction("maxx","selva",150)};
//        int len = trans.length;
//        for(int i=0;i<len;i++){
//
//        }
    }
}