# Flags
Flags, codes and names of countries of the world, Arabic / English

step 1 :-
         install library
         dependencies {
	               implementation 'com.github.MagPro116:Flags:1.0.0'
	         }
           
step 2 :-

             Spinner spinner = findViewById(R.id.spinner);
             MagPro magPro = new MagPro(this,spinner);
             magPro.fillSpinner();
             
       

To return values :-

          magPro.getCode();    // String
          magPro.getName();    // String
          magPro.getFlag();    // Bitmap   
