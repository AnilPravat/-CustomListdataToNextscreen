package myapp.anilandroid.com.customlistviewdemo.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import myapp.anilandroid.com.customlistviewdemo.R;

public class EmployeeDetailsActivity extends AppCompatActivity {

    TextView name;
    TextView companyname;
    TextView designation;
    TextView department;
    TextView officeaddress;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_emp_details );


        name =(TextView) findViewById( R.id.tv_emp_name );
        Intent intent=getIntent();
        String Empname=intent.getStringExtra( "EmployeeName" );
        name.setText(Empname);

        companyname=(TextView)findViewById( R.id.tv_emp_company_name );
        String Empcompanyname=intent.getStringExtra( "CompanyName" );
        companyname.setText( Empcompanyname );

        department=(TextView)findViewById( R.id.tv_emp_department );
        String Empdepartment=intent.getStringExtra( "DepartmentName" );
        companyname.setText( Empdepartment );

        designation=(TextView)findViewById( R.id.tv_emp_designation );
        String Empdesignation=intent.getStringExtra( "Designation" );
        companyname.setText( Empdesignation );

        officeaddress=(TextView)findViewById( R.id.tv_emp_ofc_address );
        String Empofficeaddres=intent.getStringExtra( "OfficeAddress" );
        officeaddress.setText( Empofficeaddres );

    }
}
