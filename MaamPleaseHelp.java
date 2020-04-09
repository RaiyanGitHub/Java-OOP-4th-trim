//code segment inside main func
//ArrayList<String> al=new ArrayList<String>();
        ArrayList<Department> departments__ALL = new ArrayList<Department>();
        Department first = new Department(101,"Management");
        Department second = new Department(201,"Cuisine");
        Department third = new Department(301,"Errands and Delivary");
        departments__ALL.add(first);    
        departments__ALL.add(second);    
        departments__ALL.add(third);    
             
            
          try  
          {  
              //Serialization  
              FileOutputStream fos=new FileOutputStream("Department Table");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(departments__ALL);  
              fos.close();  
              oos.close();  
             
             
             
             //Deserialization  
              FileInputStream fis=new FileInputStream("Department Table");  
              ObjectInputStream ois=new ObjectInputStream(fis);              
              ArrayList  Dept_list=(ArrayList)ois.readObject();  
              
             
             
             
             //Iterating and displaying
              Iterator itr = Dept_list.iterator();
            while(itr.hasNext()){
                Department Node = (Department)itr.next();
                Node.display();
            }
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
          //..........
_________________________________________________________
-----------------Problem-----------------------
Outputs the reference of the objects instead of displaying strings and int.
Output Sample:
      [restmanage.Department@99a589, restmanage.Department@372a00, restmanage.Department@dd8dc3]
Expected Output:
      [(101,"Management"),(201,"Cuisine"),(301,"Errands and Delivery")]
          

          
