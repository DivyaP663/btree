/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bproj;

/**
 *
 * @author DivyaPrakash
 */
import java.io.*;
import java.util.HashMap;
public class btreedem {
    static int i=1;
    static HashMap<Integer, String> mat = new HashMap<>();
     public static BTree btreecon()
     {
        BTree BTree = new BTree();
                String fileName = "C:\\Users\\Vijayalakshmi\\Downloads\\DATA\\1lk.txt";
        String fn ="C:\\Users\\Vijayalakshmi\\Downloads\\DATA\\d.txt";
        String line = null;
       try {
            FileReader fileReader = new FileReader(fileName);
            FileWriter fileWriter = new FileWriter(fn);
            PrintWriter pw =new PrintWriter(fn);
      BufferedReader bufferedReader = new BufferedReader(fileReader); 
      
             while((line = bufferedReader.readLine()) != null) {
                //              StringBuffer sb = new StringBuffer(line);
//                String sg = sb.toString();
     String[] af=line.split(",");
            	
            	 BTree.insert(i);
                 
            	 //System.out.println(line.length()+line+line.hashCode());
                mat.put(i,line);
                i++;
                 } 
           
            
            		 
             pw.close();
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex);                
        }
        catch(IOException ex) {
            System.out.println(ex);                  
            
        }
        return BTree;
    
}
      public static boolean serch(String a,BTree f)
    {
        int k=0;
      for(HashMap.Entry entry: mat.entrySet()){
          String fg=(String)entry.getValue();
            if(fg.contains(a)){
                 k = (int) entry.getKey();
                 //breaking because its one to one map
                 
            }
        
           
       
      
    }String d=mat.get(k);
    
    if(d!=null)
    {
    String [] sd= d.split(",");
    System.out.println("p_id:"+sd[0]);
   // System.out.println("patient_name:"+sd[1]);
    //System.out.println("patient_gender:"+sd[2]);
    //System.out.println("patient_age:"+sd[3]);
    //System.out.println("patient_blood_group:"+sd[4]);
    //System.out.println("date_of_admission:"+sd[5]);
    //System.out.println("date_of_discharge:"+sd[6]);
    //System.out.println("diagnosis:"+sd[7]);
    }
    if(d!=null)
    {
      
       return true;
    }
    else
    {
        return false;
    }
    
    }
      public  static void inst(String val,BTree st)
	{
		String [] sd= val.split(",");
		if(serch(sd[0],st)==true)
		{
		 System.out.println("p_id  already exist");	
		}
		else
		{
			 String filePath = "C:\\Users\\Vijayalakshmi\\Downloads\\DATA\\1lk.txt";
			st.insert(i);
			try {
				FileWriter fr= new FileWriter(filePath,true);
			    BufferedWriter lineWriter = new BufferedWriter(fr);
			    PrintWriter pw= new  PrintWriter(lineWriter);
			    pw.println(val);
			    
			 
				     
			        
			   
			    lineWriter.close();
			} catch (IOException ex) {
			    System.err.println(ex);
		}
			
		}
}
      public  static void extra(String val)
	{
            String line=null;
             try {
                       String fileName = "C:\\Users\\Vijayalakshmi\\Downloads\\DATA\\1lk.txt";
        String fn ="C:\\Users\\Vijayalakshmi\\Downloads\\DATA\\"+val+".txt";
            FileReader fileReader = new FileReader(fileName);
            FileWriter fileWriter = new FileWriter(fn);
            PrintWriter pw =new PrintWriter(fn);
      BufferedReader bufferedReader = new BufferedReader(fileReader); 
      
             while((line = bufferedReader.readLine()) != null) {
                

     String[] af=line.split(",");
     if(af.length>3){
            	if(af[2].equals(val))
                {
                    pw.println(line);
                    
                }
            	 
     }
            	
                 } 
           
            
            		 
             pw.close();
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex);                
        }
        catch(IOException ex) {
            System.out.println(ex);                  
            
        }
        }
        }
