
class Bowler
{
   private String name;
   private int runs;
   private int wicket;
   private int overs;
   Bowler(String name, int runs,int overs,int wicket)
   {
   this.name=name;
   this.runs=runs; 
   this.overs=overs;
   this.wicket=wicket;
    }
   String getName()
   {
       return this.name;
    }
     int getRunsGiven()
   {
       return this.runs;
    }
    int getOversBowled()
   {
       return this.overs;
    }
   int getWicketTaken()
   {
       return this.wicket;
    }
}