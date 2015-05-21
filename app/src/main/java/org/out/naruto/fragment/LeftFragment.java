package org.out.naruto.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import org.out.naruto.qrcodemedicine.Activity_Main;
import org.out.naruto.qrcodemedicine.R;

/**
 * @date 2014/11/14
 * @author wuwenjie
 * @description 侧边栏菜单
 */
public class LeftFragment extends Fragment implements OnClickListener{
	private View mainView;

	private View settingsView;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.layout_menu, null);
		findViews(view);
		
		return view;
	}
	
	
	public void findViews(View view) {
		mainView = view.findViewById(R.id.slidingMenuItem0);
		settingsView = view.findViewById(R.id.slidingMenuItem5);
		
		mainView.setOnClickListener(this);
		settingsView.setOnClickListener(this);
	}
	
	@Override
	public void onDestroyView() {
		super.onDestroyView();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onClick(View v) {
		Fragment newContent = null;
		String title = null;
		switch (v.getId()) {
		case R.id.slidingMenuItem0: // Main
			newContent = new MainFragment();
			title = getString(R.string.string_main);
			break;
		case R.id.slidingMenuItem5: // 设置
			newContent = new MySettingsFragment();
			title = getString(R.string.settings);
			break;
		}
		if (newContent != null) {
			switchFragment(newContent, title);
		}
	}
	
	/**
	 * 切换fragment
	 * @param fragment
	 */
	private void switchFragment(Fragment fragment, String title) {
		if (getActivity() == null) {
			return;
		}
		if (getActivity() instanceof Activity_Main) {
			Activity_Main activity_main = (Activity_Main) getActivity();
			activity_main.switchConent(fragment, title);
		}
	}
	
}
