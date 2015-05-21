package org.out.naruto.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import org.out.naruto.qrcodemedicine.R;
import org.out.naruto.qrcodemedicine.Activity_ScanQR;
import org.out.naruto.view.ADView;

/**
 *
 */
public class MainFragment extends Fragment {
    private Button scanButton;
    private View view;
    private ADView adView;
    private LinearLayout adViewOval;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_today, null);
        InitView();
        return view;
    }

    private void InitView() {
        scanButton = (Button) view.findViewById(R.id.scanButton);

        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainFragment.this.getActivity().getApplicationContext(), Activity_ScanQR.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
