// Load check (2026-11-02): fight one set of robots for a few rounds on the bench's Robocode and print
// every battle error (load rejections) and every robot output line that looks like a fault.
// Run with tools/loadcheck/run.sh; see docs/bench/melee-broken-1.11.2.md.
import java.io.File;
import java.util.*;
import robocode.control.*;
import robocode.control.events.*;
import robocode.control.snapshot.*;
public class Check {
  public static void main(String[] a) throws Exception {
    File home=new File(a[0]); int rounds=Integer.parseInt(a[1]);
    List<String> names=List.of(a).subList(2,a.length);
    RobocodeEngine.setLogMessagesEnabled(false);
    RobocodeEngine eng=new RobocodeEngine(home);
    Map<String,List<String>> notes=new TreeMap<>();
    Map<String,Integer> cnt=new HashMap<>();
    eng.addBattleListener(new BattleAdaptor(){
      public void onBattleError(BattleErrorEvent e){System.out.println("BATTLEERROR "+e.getError());}
      public void onBattleMessage(BattleMessageEvent e){String m=e.getMessage(); if(!m.startsWith("Round")&&!m.contains("Let the games"))System.out.println("BATTLEMSG "+m);}
      public void onTurnEnded(TurnEndedEvent e){
        for(IRobotSnapshot r: e.getTurnSnapshot().getRobots()){
          String o=r.getOutputStreamSnapshot(); if(o==null||o.isEmpty())continue;
          for(String l:o.split("\n")){ String t=l.trim(); if(t.isEmpty())continue;
            if(t.matches("(?i).*(SYSTEM|exception|error|disabled|denied|prevent|security|not allowed|violat).*")){
              String k=r.getName(); int c=cnt.merge(k,1,Integer::sum); if(c<=6) System.out.println("OUT "+k+" :: "+t);}}
        }}
      public void onBattleCompleted(BattleCompletedEvent e){
        for(robocode.BattleResults r:e.getSortedResults()) System.out.println("RESULT "+r.getTeamLeaderName()+" score="+r.getScore()+" dmg="+r.getBulletDamage()+" surv="+r.getSurvival());}
    });
    RobotSpecification[] rs=eng.getLocalRepository(String.join(",",names));
    System.out.println("LOADED "+rs.length+" of "+names.size());
    Set<String> got=new HashSet<>(); for(RobotSpecification r:rs) got.add(r.getNameAndVersion());
    for(String n:names) if(!got.contains(n)) System.out.println("MISSING "+n);
    if(rs.length>=2) eng.runBattle(new BattleSpecification(new BattlefieldSpecification(1000,1000),rounds,450,0.1,0,false,rs),true);
    eng.close(); System.exit(0);
  }
}
