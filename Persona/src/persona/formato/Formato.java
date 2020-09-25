/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona.formato;

/**
 *
 * @author raulh
 */
public class Formato {
    
    
    public static final String aMayuscula(String string){
        String temp = "";
        String trim = string.trim();                
        int indexOf = trim.indexOf(" ");
        if(indexOf < 0){
            char[] toCharArray = trim.toCharArray();
                char toUpperCase = Character.toUpperCase(toCharArray[0]);
                toCharArray[0] = toUpperCase;  
                for(int i= 1;i < toCharArray.length; i++ ){
                    char toLowerCase = Character.toLowerCase(toCharArray[i]);
                    toCharArray[i] = toLowerCase;
                }
                temp = new String(toCharArray);
        }else{
            String substring_1 = trim.substring(0, (indexOf -1));
            String substring_2 = trim.substring(indexOf + 1, trim.length());
            
            String aMayuscula = aMayuscula(substring_1);
            String aMayuscula1 = aMayuscula(substring_2);            
            
            StringBuilder builder = new StringBuilder();
                builder.append(aMayuscula)
                        .append(" ")
                        .append(aMayuscula1);
                temp = new String(builder);
                
        }
            return temp.trim();
        
    }
}
