package primerosDias;
public class booleans {
    public static void main(String[] args) {
    boolean a = false;
    boolean b = true;
    boolean c = true;
    boolean v = (a | b) & c & (a | c);
    System.out.println(v);
    /*
    *(false o true) y true y (false o true) 
    *true y (false o true) = true
    */
    boolean ec = !(!a|b&a)&c|(a|c&a)|b|!(a|b);
    System.out.println(ec);
    /*
     *!(!false o true y false) y true o (false o true y false) o true o !(false o true)
     *(false o false y true) y true o (false o true y false) o true o (true o false)
     *(false o false y true) y true o (false o true y false) o true o (true o false)
     */

     
    
    }}