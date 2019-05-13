# Flags
Flags, codes and names of countries of the world, Arabic / English

step 1 :-
         install library
         dependencies {
	               implementation 'com.github.MagPro116:Flags:1.0.0'
	         }
           
step 2 :-
       import com.gmail.magpro116.flags.MagPro;
       public class MainActivity extends AppCompatActivity {
           MagPro magPro;
           Spinner spinner;
           @Override
           protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_main);

             spinner = findViewById(R.id.spinner);
             magPro = new MagPro(this,spinner);
             magPro.fillSpinner();
             
            } 
        }

To return values :-

          magPro.getCode();    // String
          magPro.getName();    // String
          magPro.getFlag();    // Bitmap   
