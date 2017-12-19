package com.list.effection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private ListViewAdapter mAdapter;
    private List<DeviceInfo> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        setListData();
        mAdapter = new ListViewAdapter(this,mData);
        listView.setAdapter(mAdapter);

    }

    public void setListData(){
        DeviceInfo entity = new DeviceInfo();
        entity.setImage("http://picture.quanjiakan.com/quanjiakan/resources/device/20171130091947_5kk2b6kz1yhuexo8lhxh.png");
        entity.setImei("355637052788452");
        entity.setLocation("113.2410457,23.132289");
        entity.setLocationTime("2017-11-15 16:01:02.0");
        entity.setName("%E8%80%81%E5%A4%B4%E5%AD%90");
        entity.setPhone("18620155897");
        entity.setOnline(1);
        entity.setType(0);
        mData.add(entity);

        entity = new DeviceInfo();
        entity.setImage("http://picture.quanjiakan.com/quanjiakan/resources/device/20171204092452_2ukr750j92x3tbyddf85.png");
        entity.setImei("866333030000093");
        entity.setLocation("113.241903,23.132040");
        entity.setLocationTime("2017-12-01 11:21:24.0");
        entity.setName("%E7%88%B9");
        entity.setPhone("18011935659");
        entity.setOnline(0);
        entity.setType(0);
        mData.add(entity);

        entity = new DeviceInfo();
        entity.setImage("http://picture.quanjiakan.com/quanjiakan/resources/device/20171208164606_v7zkmalicyxmti91dsou.png");
        entity.setImei("355637053077723");
        entity.setLocation("113.2419963,23.1320928");
        entity.setLocationTime("2017-12-01 11:21:24.0");
        entity.setName("%E8%80%81%E5%A4%B4");
        entity.setPhone("18011935659");
        entity.setOnline(0);
        entity.setType(0);
        mData.add(entity);
    }
}
