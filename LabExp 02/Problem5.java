package javaprobse2;

/**
 *
 * @author سعدي
 */
public class Problem5 {
    public void ReverseCard(String some){
        int i=0,j=some.length()-1;
        
        String emos="";
        
        for(;j>=0;j--){
            
             emos += some.charAt(j);//this will append each character from input string 
                                    //to destination object backwards.
        }
        
        System.out.println("The reverse of \'"+some+"\' is \'"+emos+"\'.");
        
    }
    
}
