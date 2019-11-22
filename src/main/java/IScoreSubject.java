/**
 * Write a description of class IScoreSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IScoreSubject  
{
    // instance variables - replace the example below with your own
    
  public void addObserver(IScoreObserver observer);
  public void  removeObserver(IScoreObserver observer);
   public void  notifyupdate();
    
   
}
