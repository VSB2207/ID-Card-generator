/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VAIBHAV SINGH
 */
class User {
    private int sid,contact,pcode;
    private String fname,lname,gender,dob,email,add1,add2,imgfile;
    
    public  User(int sid, int contact, int pcode, String fname, String lname, String gender,String dob,String email,String add1,String add2,String imgfile)
    {
        this.sid=sid;
        this.fname=fname;
        this.lname=lname;
        this.dob=dob;
        this.gender=gender;
        this.email=email;
        this.contact=contact;
        this.add1=add1;
        this.add2=add2;
        this.pcode=pcode;
        this.imgfile=imgfile;
    }
    public int getsid(){
        return sid;
    }
    public int getcontact(){
        return contact;
    }
    public int getpcode(){
        return pcode;
    }
    public String getfname(){
        return fname;
    }
    public String getlname(){
        return lname;
    }
    public String getdob(){
        return dob;
    }
    public String getgender(){
        return gender;
    }
    public String getemail(){
        return email;
    }
    public String getadd1(){
        return add1;
    }
    public String getadd2(){
        return add2;
    }
    public String getimgfile(){
        return imgfile;
    }

   
    
}
