# TwoBalCollisionProgressDialog
仿人人网下拉刷新的加载动画

         
## 效果图
  ![image](https://github.com/dalong982242260/TwoBalCollisionProgressDialog/blob/master/screenshot/twodialog.gif)       
   
         
## 使用：
          
         ‘<com.dalong.demo.view.CustomImageView‘  <br />
                 ‘android:id="@+id/imageview1"‘ <br />
                ‘ android:layout_width="match_parent"‘<br />
                 ‘android:layout_height="match_parent"‘<br />
                  ‘/>‘<br />
                  
## 设置数据：                 
 mImageView = (CustomImageView)findViewById(R.id.imageview1);
        mImageView.setInterval(60);//切换一次的时间
        mImageView.setLoop(true);//是否循环切换
        mImageView.addImageFrame(R.drawable.loading3_01);
        mImageView.addImageFrame(R.drawable.loading3_02);
        mImageView.addImageFrame(R.drawable.loading3_03);
        mImageView.addImageFrame(R.drawable.loading3_04);
        mImageView.addImageFrame(R.drawable.loading3_05);
        mImageView.addImageFrame(R.drawable.loading3_06);
        mImageView.addImageFrame(R.drawable.loading3_07);
        mImageView.addImageFrame(R.drawable.loading3_08);
        mImageView.addImageFrame(R.drawable.loading3_09);
        mImageView.addImageFrame(R.drawable.loading3_10);
        mImageView.addImageFrame(R.drawable.loading3_11);
        mImageView.addImageFrame(R.drawable.loading3_12);
        mImageView.addImageFrame(R.drawable.loading3_13);
        mImageView.addImageFrame(R.drawable.loading3_14);
        mImageView.addImageFrame(R.drawable.loading3_15);
        mImageView.addImageFrame(R.drawable.loading3_16);
        mImageView.addImageFrame(R.drawable.loading3_17);
        mImageView.addImageFrame(R.drawable.loading3_18);
        mImageView.addImageFrame(R.drawable.loading3_19);
        mImageView.addImageFrame(R.drawable.loading3_20);
        mImageView.addImageFrame(R.drawable.loading3_21);
