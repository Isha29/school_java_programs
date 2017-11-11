
class Batsman
{
   private String name;
   private int runs;
   private int out;
   private int balls;
   Batsman(String name, int runs, int out,int balls )
   {
   this.name=name;
   this.runs=runs;
   this.out=out;
   this.balls=balls; 
    }
   String getName()
   {
       return this.name;
    }
     int getRunsScored()
   {
       return this.runs;
    }
    int getBallsFaced()
   {
       return this.balls;
    }
    boolean isOut()
   {
       return (this.out==1);
    }
}