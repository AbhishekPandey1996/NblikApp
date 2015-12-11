package example.abhishek.com.materialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Abhishek on 11-12-2015.
 */
public class MyFragment extends Fragment {
    private TextView textview;
    public static MyFragment getInstansce(int position){
        MyFragment myFragment = new MyFragment();
        Bundle args = new Bundle();
        args.putInt("positon",position);
        myFragment.setArguments(args);
        return myFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.viewpager_fragment1,container,false);
        textview = (TextView) layout.findViewById(R.id.position);
        Bundle bundle = getArguments();
        if(bundle != null){
            textview.setText("The page selected is " +bundle.getInt("positon",0));
        }
        return layout;
    }
}