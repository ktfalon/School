package ca.tru.t00522334.storesim;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.widget.Toast;


/**
 * Created by T00522334 on 10/16/2015.
 */

public class MenuItem extends Activity
{
    private List<BaseItem> _listItems = new ArrayList<>();

    public void AddItem(double price,String name,String ImagePath)
    {
        for(BaseItem currentItem : _listItems) // Every item in list
        {
            if (currentItem.GetName().contains(name)) //Item already in list
            {
                //display in short period of time
                Toast.makeText(getApplicationContext(), "The item:" + name + " is already contained within the item list", Toast.LENGTH_SHORT).show(); //Shwo error message
                return;// End method
            }
        }
            _listItems.add(new BaseItem(price,name,ImagePath)); // Add item to list
    }

    public void DeleteItem(String name)
    {
        List<BaseItem> _tempList = new ArrayList<BaseItem>();;
        for(BaseItem currentItem : _listItems) // Every item in list
        {
            if (!currentItem.GetName().contains(name)) //Item is not name IE we want it
            {
                _tempList.add(new BaseItem(currentItem.GetPrice(),currentItem.GetName(),currentItem.GetItemPath()));
            }
        }
        _listItems = _tempList; //replace list with temp list
    }

    public List<BaseItem> GetItems()
    {
        return _listItems;//return list derp
    }

}
