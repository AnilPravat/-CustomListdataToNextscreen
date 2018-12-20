package myapp.anilandroid.com.customlistviewdemo.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import myapp.anilandroid.com.customlistviewdemo.R;
import myapp.anilandroid.com.customlistviewdemo.adapter.EmployeeCustomAdapter;
import myapp.anilandroid.com.customlistviewdemo.model.EmployeeModel;

public class MainActivity extends AppCompatActivity {
ListView listView;
    ArrayList<EmployeeModel> employeelistData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        listView=(ListView)findViewById( R.id.list_view );


        employeelistData= new ArrayList<>();
//employeelistData.add( new EmployeeModel("pravat","Mindtree","IT","ASC","Marathahalli"));

        EmployeeModel employeeModel=new EmployeeModel( );
        employeeModel.setName( "Pravat" );
        employeeModel.setCompanyName("Mindtree");
        employeeModel.setDepartment("IT");
        employeeModel.setDesignation("ASC");
        employeeModel.setOfficeAddress("Marathahalli");
        employeelistData.add(employeeModel);


        EmployeeModel employeeModel1=new EmployeeModel();
        employeeModel1.setName( "Anil" );
        employeeModel1.setCompanyName("ITC Limited");
        employeeModel1.setDepartment("ADM");
        employeeModel1.setDesignation("Software Engg");
        employeeModel1.setOfficeAddress("Banaswadi");
        employeelistData.add(employeeModel1);


        EmployeeModel employeeModel2=new EmployeeModel();
        employeeModel2.setName( "Sunil" );
        employeeModel2.setCompanyName("Capgemini");
        employeeModel2.setDepartment("R & D");
        employeeModel2.setDesignation("Jr.Software Engg");
        employeeModel2.setOfficeAddress("White Field");
        employeelistData.add(employeeModel2);


        EmployeeModel employeeModel3=new EmployeeModel( );
        employeeModel3.setName( "Rabi" );
        employeeModel3.setCompanyName("Infosys");
        employeeModel3.setDepartment("Product Development");
        employeeModel3.setDesignation("Application Support Engg");
        employeeModel3.setOfficeAddress("Banaswadi");
        employeelistData.add(employeeModel3);


        EmployeeModel employeeModel4=new EmployeeModel(  );
        employeeModel4.setName( "Sujata" );
        employeeModel4.setCompanyName("July System");
        employeeModel4.setDepartment("Support & Development");
        employeeModel4.setDesignation("Application Programmer");
        employeeModel4.setOfficeAddress("Bellandur");
        employeelistData.add(employeeModel4);


        EmployeeModel employeeModel5=new EmployeeModel( );
        employeeModel5.setName( "Rabindra" );
        employeeModel5.setCompanyName("Genpect");
        employeeModel5.setDepartment("BFSI");
        employeeModel5.setDesignation("Senior Software Engg");
        employeeModel5.setOfficeAddress("K R Puram");
        employeelistData.add(employeeModel5);

        EmployeeCustomAdapter employeeCustomAdapter=new EmployeeCustomAdapter( getApplicationContext(),employeelistData);
        listView.setAdapter(employeeCustomAdapter);
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent=new Intent(MainActivity.this,EmployeeDetailsActivity.class );
        intent.putExtra( "EmployeeName",employeelistData.get( i ).getName());
        intent.putExtra( "CompanyName",employeelistData.get( i ).getCompanyName());
        intent.putExtra( "DepartmentName",employeelistData.get( i ).getDepartment());
        intent.putExtra( "Designation",employeelistData.get( i ).getDesignation());
        intent.putExtra( "OfficeAddress",employeelistData.get( i ).getOfficeAddress());
        startActivity( intent );
    }
      });
    }


}
