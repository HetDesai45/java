import java.io.*; 
importjava.util.*; 

classFramesort { 
  public static void main(String args[])  {  
    Scanner s=new Scanner(System.in); 
    System.out.println("enter the number of frames:"); 
    int n=s.nextInt(); 
    intseq[]=new int[n];  
    String msg[]=new String[n]; 
    for(inti=0;i<n;i++)  { 
      System.out.println("enter the sequence no.of frame"+(i+1)+":"); 
      seq[i]=s.nextInt(); s.nextLine(); 
      System.out.println("enter the msg in frmae"+(i+1)+":"); 
      msg[i]=s.nextLine();  
    } 
    
    for(inti=0;i<n;i++)  { 
      for(int j=0;j<n;j++)  { 
        if(seq[j]>seq[i])  { 
          int temp=seq[i]; 
          seq[i]=seq[j]; 
          seq[j]=temp;  
          String tem=msg[i]; 
          msg[i]=msg[j]; 
          msg[j]=tem;  
        }  
      }  
    } 
    
    for(inti=0;i<n;i++)  { 
      System.out.println("frame sequence no ->"+seq[i]); System.out.println("frame message ->"+msg[i]);  
    }  
  } 
} 