import java.io.*;
class Attendance
    {
        public static void main(String args[])throws IOException
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String sub[]={"PQT","MPMC","GER","APTI","POC","ADA","JAVA","PE","ADAL","JAVAL","MPMCL"};
                int tot[]={48,37,24,26,38,33,37,30,26,24,24};
                int pos=0;
                System.out.println("Write your Subject's Short form");
                System.out.println("Which Subject Attendance?");
                String subs=br.readLine();
                for(int i=0;i<sub.length;i++)
                    {
                        String k=sub[i];
                        if(subs.equalsIgnoreCase(k)==true)
                            {
                                pos=i;
                            }
                        }
                        System.out.println("Total Number of Hours for.."+sub[pos]+" is..."+tot[pos]);
                        System.out.println("How many hours are conducted?");
                        int hrs=Integer.parseInt(br.readLine());
                        System.out.println("How many hours have you missed?");
                        int mis=Integer.parseInt(br.readLine());
                        int pres=hrs-mis;//Hours PRESENT
                        double cur=(double)(pres*1.0/hrs)*100;//Current Attendance
                        
                        if(cur<75.0)
                            {
                                System.out.println("Your Attendance is--"+cur+"%"+"  and you are in danger");
                            }
                            else if(cur>75.0)
                                System.out.println("Your Attendance is--"+cur+"%"+"and you are out of danger");
                                
                                int k=tot[pos];
                                int left=tot[pos]-hrs;
                                int need=(int)(0.75*k);//Total Days need to be present
                                int rec=need-pres;
                                if(rec>left)
                                    {
                                        System.out.println("I'm sorry you will be detained");
                                    }
                                    if(rec<=left)
                                        {
                                            System.out.println("\nYou can save yourself from getting detained");
                                            System.out.println("\nHours Left are :"+left);
                                            System.out.println("\nHours need to be present for 75% Attendance :"+(need-pres));
                                        }
                                    }
                                }
                                
                                
                                
                                
               
                
                
                