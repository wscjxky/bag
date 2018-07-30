package com.xukaiyuan.handbag.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xukaiyuan.handbag.Book.Part;
import com.xukaiyuan.handbag.R;
import com.xukaiyuan.handbag.Tools.TypefaceUtils;

/**
 * Author：xukaiyuan
 * Date：2017/2/7
 * Email：wscjxky@gamil.com
 * God bless, never bug.
 */

public class ReadBookFragment extends Fragment {
    private static final String ARG_PART = "ARG_PART";

    public static ReadBookFragment newInstance(Part p) {

        Bundle args = new Bundle();
        args.putParcelable(ARG_PART,p);
        ReadBookFragment fragment = new ReadBookFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.activity_read_article,container,false);
        Part p=getArguments().getParcelable(ARG_PART);
        TypefaceUtils.setText((TextView)v. findViewById(R.id.title_text),p.getTitle());
        TypefaceUtils.setText((TextView)v. findViewById(R.id.content_text),p.getContent());
        return v;
    }
}
