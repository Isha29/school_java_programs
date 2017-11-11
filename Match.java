import Player.Batsman;
import Player.Bowler;
 class Match
 {
   Batsman Batsmen[];   
   Match(int n)
   {
     Batsmen=new Batsman[n];  
    }
   void showBatsmanDetail(Batsman b)
   {
       System.out.println("Name :" +b.getName());
       System.out.println("balls faced :" +b.getBallsFaced());          
    }
    void main()
    {
        Match obj=new Match(2);
        
        obj.Batsmen[0]=new Player.Batsman("Virat",5,1,6);  
        obj.Batsmen[1]=new Batsman("Sehwag",6,0,12);  
        obj.showBatsmanDetail(obj.Batsmen[0]);
        obj.showBatsmanDetail(obj.Batsmen[1]);
    }
    }