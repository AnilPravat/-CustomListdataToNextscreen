package myapp.anilandroid.com.customlistviewdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import myapp.anilandroid.com.customlistviewdemo.R;
import myapp.anilandroid.com.customlistviewdemo.model.EmployeeModel;

public class EmployeeCustomAdapter extends BaseAdapter{

    Context context;
    private ArrayList<EmployeeModel> employeedata;//arraylist object
    LayoutInflater layoutInflater=null;
    public EmployeeCustomAdapter(Context context, ArrayList<EmployeeModel> employeedata) {
        this.context = context;
        this.employeedata = employeedata;
    }



    @Override
    public int getCount() {
        return employeedata.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        EmployeeModel employeeModel= (EmployeeModel)employeedata.get(i);
        View convertview=view;
        ViewHolder viewHolder;

        if(view==null){
            layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview=layoutInflater.inflate( R.layout.employee_info_row_items, null );
            viewHolder=new ViewHolder();
            viewHolder.Name=(TextView)convertview.findViewById( R.id.tv_emp_name);
            viewHolder.CompanyName=(TextView)convertview.findViewById( R.id.tv_emp_company_name );
            viewHolder.Department=(TextView)convertview.findViewById( R.id.tv_emp_department);
            viewHolder.Designation=(TextView)convertview.findViewById( R.id.tv_emp_designation);
            viewHolder.OfficeAddress=(TextView)convertview.findViewById( R.id.tv_emp_ofc_address);
            convertview.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertview.getTag();

        }
        viewHolder.Name.setText(employeeModel.getName());
        viewHolder.CompanyName.setText(employeeModel.getCompanyName());
        viewHolder.Department.setText(employeeModel.getDepartment());
        viewHolder.Designation.setText(employeeModel.getDesignation());
        viewHolder.OfficeAddress.setText( employeeModel.getOfficeAddress());
        return convertview;
    }
    public static class ViewHolder{
        TextView Name,CompanyName,Department,Designation,OfficeAddress;
    }
}
