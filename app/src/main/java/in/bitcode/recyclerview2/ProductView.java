package in.bitcode.recyclerview2;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ProductView extends LinearLayout {

    private ImageView mImgProduct;
    private TextView mTxtProductTitle, mTxtProductPrice;
    private Button mBtnNotify;

    private Product mProduct;

    public ProductView(Context context) {
        super(context);
        hookup(context);
    }

    public ProductView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        hookup(context);
    }

    private void hookup(Context context) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.product, this);
        //this.addView(view);

        mImgProduct = view.findViewById(R.id.imgProduct);
        mTxtProductPrice = view.findViewById(R.id.txtProductPrice);
        mTxtProductTitle = view.findViewById(R.id.txtProductName);
        mBtnNotify = view.findViewById(R.id.btnNotify);

        /*
        this.setGravity(Gravity.CENTER_VERTICAL);

        mImgProduct = new ImageView(context);
        mImgProduct.setLayoutParams(
                new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        );
        this.addView(mImgProduct);

        mTxtProductTitle = new TextView(context);
        mTxtProductTitle.setTextSize(40);
        mTxtProductTitle.setPadding(20, 0, 0, 0);
        this.addView(mTxtProductTitle);
        */


    }

    public void setProduct(Product product) {
        mProduct = product;

        mImgProduct.setImageResource(mProduct.getImageId());
        mTxtProductTitle.setText(mProduct.getTitle());
        mTxtProductPrice.setText(mProduct.getPrice() + "");

        if(mProduct.getStock() <= 0) {
            mBtnNotify.setVisibility(View.GONE);
        }
    }
}
