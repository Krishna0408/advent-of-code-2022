import java.net.SocketPermission;
import java.nio.file.StandardOpenOption;
import java.util.*;

class current{
public static String[][] details(){
Scanner e = new Scanner(System.in);
System.out.println("Enter Customer Details (Id,Name,prev,curr) : ");
String a[][] = new String[4][4];
for(int i=0;i<4;i++){
for(int j=0;j<4;j++){
a[i][j]=e.next();
}  
}
return a;
}
}

class current1{

void display(String[][] a){
Scanner sc = new Scanner(System.in);
System.out.println();
System.out.print("Enter customer Id you want : ");
int id = sc.nextInt();
System.out.println();
if(id == 1){
for(int i=0;i<1;i++){
for(int j=0;j<4;j++){
    int c=Integer.parseInt(a[0][3]); 
    if(j==3){ 
        if(c<101){
            System.out.println(c);
            }
            else if(c>=101 && c<201){
                System.out.println(c*2.5);
            }
            else if(c>=201 && c<500){
                System.out.println(c*4);
            }
            else{
                System.out.println(c*6);
            }
    }
    else{
System.out.print(a[i][j]+" ");
    }
}
}
}
else if(id == 2){
    for(int i=1;i<2;i++){
    for(int j=0;j<4;j++){
        int c=Integer.parseInt(a[1][3]); 
        if(j==3){
            if(c<101){
                System.out.println(c);
                }
                else if(c>=101 && c<201){
                    System.out.println(c*2.5);
                }
                else if(c>=201 && c<500){
                    System.out.println(c*4);
                }
                else{
                    System.out.println(c*6);
                }
        }
        else{
    System.out.print(a[i][j]+" ");
        }
    }
    }
    }
    else if(id == 3){
        for(int i=2;i<3;i++){
        for(int j=0;j<4;j++){
            int c=Integer.parseInt(a[2][3]); 
            if(j==3){
                if(c<101){
                System.out.println(c);
                }
                else if(c>=101 && c<201){
                    System.out.println(c*2.5);
                }
                else if(c>=201 && c<500){
                    System.out.println(c*4);
                }
                else{
                    System.out.println(c*6);
                }
            }
            else{
        System.out.print(a[i][j]+" ");
            }
        }
        }
        }
        else if(id == 4){
            for(int i=3;i<4;i++){
            for(int j=0;j<4;j++){
                int c=Integer.parseInt(a[3][3]); 
                if(j==3){
                    if(c<101){
                    System.out.println(c);
                    }
                    else if(c>=101 && c<201){
                        System.out.println(c*2);
                    }
                    else{
                        System.out.println(c*3.5);
                    }
                }
                else{
            System.out.print(a[i][j]+" ");
                }
            }
            }
            }
                }
}

class electricity{
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
current c = new current();
current1 c1 = new current1();
String[][] details = c.details();
System.out.print("Enter your Choice :");
int choice=scan.nextInt();
int cont=1;
while(cont!=0){
switch(choice){
    case 1 : c1.display(details);
    break;
    case 2: System.exit(0);
    break;
}
System.out.print("Do u want to contine :");
cont=scan.nextInt();
}
}
}
