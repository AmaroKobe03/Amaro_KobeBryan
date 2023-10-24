package student;
   
   
   class student{
    
      private String first_name = "";
      private String middle_name = "";
      private String last_name = "";
      private String suffix = "";
  
    
   public String getFirstName(){
      return first_name; 
      
   
   }
      public String getMiddleName(){
          return middle_name; 
   }
      public String getMiddletName(){
         return last_name; 
   }
   
       public String getSuffix(){
         return suffix; 
   }
   
     public  void setFirstName( String fName ){
         first_name = fName;
   }
     public  void setLasttName( String LName ){
         first_name = LName;
   }

    public  void setSuffix( String Suffix ){
         suffix = Suffix;
   }
      public String getFullName(){
   
         return first_name+" "+middle_name+" "+last_name+" "+suffix;
   
     }

   }
   