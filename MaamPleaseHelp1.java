public Manager(){
        Scanner InPut = new Scanner(System.in);
        System.out.println("Enter the Employee ID:");
        int ID = InPut.nextInt();
        
        System.out.println("Enter the First Name:");
        String fname = InPut.next();
        
        System.out.println("Enter the Last Name:");
        String nameL = InPut.next();
        
        System.out.println("Enter Email:");
        String email = InPut.next();
        
        System.out.println("Enter Department id");
        int deptID = InPut.nextInt();
        
        /*String deptName;
        for(Department x: departments__ALL){
            if(x.id == deptID){
                 this.department = x;
            }
            else 
                System.out.println(" Department not found:");
        }
        */try{
        FileInputStream fis=new FileInputStream("Department Table");  
              ObjectInputStream ois=new ObjectInputStream(fis);              
              ArrayList  Dept_list=(ArrayList)ois.readObject();
              
              
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Enter");
        System.out.println("Enter");
        System.out.println("Enter");
        System.out.println("Enter");
        
    }
    
    public void hireemployee()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Which position you want to hire?");
        System.out.println("/n1.Waiter");
        System.out.println("/n2.Chef");
        System.out.println("/n3.Cashier");
        System.out.println("Enter any number(1-3)");
        int n=input.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("Id no:");
                int iD=input.nextInt();
                System.out.println("Type firstname");
                String name=input.next();
                System.out.println("Type lastname");
                String name1=input.next();
                System.out.println("Email");
                String eml=input.next();
                department.id=011;
                department.name="Waiter";
                System.out.println("type streetname");
                
                adress.streetname=input.next();
                System.out.println("Type town name");
                adress.town=input.next();
                 waiter waiterr=new waiter(iD,name,name1,eml,department,adress);
                break;
                
            case 2:
                
                 System.out.println("Id no:");
                int iDc=input.nextInt();
                System.out.println("Type firstname");
                String namec=input.next();
                System.out.println("Type lastname");
                String name1c=input.next();
                System.out.println("Email");
                String emlc=input.next();
                department.id=012;
                department.name="Chef";
                System.out.println("type streetname");
                
                adress.streetname=input.next();
                System.out.println("Type town name");
                adress.town=input.next();
                 Chefs chef01=new Chefs(iDc,namec,name1c,emlc,department,adress);
                break;
                
            case 3:
                
                System.out.println("Id no:");
                int iDm=input.nextInt();
                System.out.println("Type firstname");
                String namem=input.next();
                System.out.println("Type lastname");
                String name1m=input.next();
                System.out.println("Email");
                String emlm=input.next();
                department.id=013;
                department.name="Cashier";
                System.out.println("type streetname");
                
                adress.streetname=input.next();
                System.out.println("Type town name");
                adress.town=input.next();
                Cashier bright=new Cashier(iDm,namem,name1m,emlm,department,adress);
                break;
            default:
                System.out.println("Type correct number");
                
                              

                
                
        }
//__________________________________________Problem_______________________________________________________________________
NetBeans Keeps throwing error : Constructor does not contain arguments.
Can I not implement a constructor which does not take any arguments but takes them using a Scanner Class Object inside?
        
