package RPG_Fight;

public class Data
{
   private static String name;
   private static int heal;
   private static int lvPlayer;
   private static int hpPlayer;
   private static int dmgPlayer;
   private static int lvEnemy;
   private static int hpEnemy;
   private static int  dmgEnemy;
   private static double skalierung;
   private static double eSkalierung;
   private static int abilityLevel;
   private static int enemyStrength;
   private static int txt;
   private static int healPlus;
   private static int hpEnemySave;

   public static void sethpEnemySave(int neu)
   {
      hpEnemySave = neu;
   }
   public static int gethpEnemySave()
   {
       return hpEnemySave;
   }
   
   public static void setHealPlus(int neu)
   {
      healPlus = neu;
   }
   public static int getHealPlus()
   {
       return healPlus;
   }
   
   public static void setTxt(int neu)
   {
       txt = neu;
   }
   public static int getTxt()
   {
       return txt;
   }
   
   public static void setEnemyStrength(int neu)
   {
       enemyStrength = neu;
   }
   public static int getEnemyStrength()
   {
       return enemyStrength;
   }
   
   public static void setAbilityLevel(int neu)
   {
       abilityLevel = neu;
   }
   public static int getAbilityLevel()
   {
       return abilityLevel;
   }
   
   public static void setSkalierung(double neu)
   {
       skalierung = neu;
   }
   public static double getSkalierung()
   {
       return skalierung;
   }
   
   public static void seteSkalierung(double neu)
   {
       eSkalierung = neu;
   }
   public static double geteSkalierung()
   {
       return eSkalierung;
   }
   
   public static void setHeal(int neu)
   {
       heal = neu;
   }
   public static int getHeal()
   {
       return heal;
   }
   
   public static void setName(String neu)
   {
       name = neu;
   }
   public static String getName()
   {
       return name;
   }
   
   public static void setlvPlayer(int neu)
   {
      lvPlayer = neu;
   }
   public static int getlvPlayer()
   {
       return lvPlayer;
   }
   
   public static void sethpPlayer(int neu)
   {
      hpPlayer = neu;
   }
   public static int gethpPlayer()
   {
       return hpPlayer;
   }
   
   public static void setdmgPlayer(int neu)
   {
      dmgPlayer = neu;
   }
   public static int getdmgPlayer()
   {
       return dmgPlayer;
   }
   
   
   public static void setlvEnemy(int neu)
   {
      lvEnemy = neu;
   }
   public static int getlvEnemy()
   {
       return lvEnemy;
   }
   
   public static void sethpEnemy(int neu)
   {
      hpEnemy = neu;
   }
   public static int gethpEnemy()
   {
       return hpEnemy;
   }
   
   public static void setdmgEnemy(int neu)
   {
      dmgEnemy = neu;
   }
   public static int getdmgEnemy()
   {
       return dmgEnemy;
   }
}
