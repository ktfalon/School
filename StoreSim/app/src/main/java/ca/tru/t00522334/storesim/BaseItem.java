package ca.tru.t00522334.storesim;

/**
 * Created by T00522334 on 10/16/2015.
 */
public class BaseItem
{
        private double _price;
        private String _name;
        private String _imagePath;

        public BaseItem(double price,String name,String ImagePath)
        {
            _price = price;
            _name = name;
            _imagePath = ImagePath;
        }

        public double GetPrice()
        {
            return _price;
        }
        public void SetPrice(double price)
        {
            _price = price;
        }

        public String GetName()
        {
            return _name;
        }
        public void SetName(String name)
        {
            _name = name;
        }

        public String GetItemPath()
        {
            return _imagePath;
        }
        public void SetItemPath(String imagePath)
        {
            _imagePath = imagePath;
        }
}
