package Player;


public class Batsman
{
   private String name;
   private int runs;
   private int out;
   private int balls;
   public Batsman(String name, int runs, int out,int balls )
   {
   this.name=name;
   this.runs=runs;
   this.out=out;
   this.balls=balls; 
    }
  public String getName()
   {
       return this.name;
    }
     int getRunsScored()
   {
       return this.runs;
    }
   public int getBallsFaced()
   {
       return this.balls;
    }
    boolean isOut()
   {
       return (this.out==1);
    }
}