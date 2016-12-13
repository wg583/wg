package adapter;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;

/**
 * Created by Administrator on 2016/12/12.
 */

public class ExpandableListView implements ExpandableListAdapter {
    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }
//获取组数
    @Override
    public int getGroupCount() {
        return 0;
    }
//获取子组数
    @Override
    public int getChildrenCount(int groupPosition) {
        return 0;
    }
//获取父数据
    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }
//获取子数据
    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }
//获取父Id
    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }
//获取子ID
    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }
//设置组视图
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        return null;
    }
//设置子视图
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return null;
    }
//是否选择
    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void onGroupExpanded(int groupPosition) {

    }

    @Override
    public void onGroupCollapsed(int groupPosition) {

    }

    @Override
    public long getCombinedChildId(long groupId, long childId) {
        return 0;
    }

    @Override
    public long getCombinedGroupId(long groupId) {
        return 0;
    }
}
