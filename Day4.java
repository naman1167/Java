public class Day4 {
    public static void main(String[] args) {
        // Concatenate
        String Name = "Naman";
        // String S3 =Name.concat(" Sethi");
        // System.out.println (S3);

        // length
        int length = Name.length();
        System.out.println(length);
        // 
        // Append



        // Upper Case
        String upperStr  = Name.toUpperCase();
        System.out.println(upperStr);

        // Lowercase
        String Lowerrrr = Name.toLowerCase();
        System.out.println(Lowerrrr );
        
        // Substring
        String Subs = Name.substring(2);
        System.out.println(Subs);
        // Replace
       
        // String Buildersss !! 

        
                StringBuilder sb = new StringBuilder("Hello");
        
                sb.append(", World");              
                System.out.println(sb);            
        
                sb.insert(5, " Java");            
                System.out.println(sb);            
        
                sb.replace(6, 10, "C++");          
                System.out.println(sb);          
        
                sb.delete(5, 9);                  
                System.out.println(sb);            
        
                sb.reverse();                    
                System.out.println(sb);            

                
            }

        }
        



    
    




  
