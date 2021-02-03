package in.bitcode.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> mListProducts;
    private RecyclerView mRecyclerProducts;
    private AdapterProducts mAdapterProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        {
            mListProducts = new ArrayList<>();
            mListProducts.add(new Product(1, "1Laptop", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(2, "2Projector", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(3, "3Camera", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "4Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "5Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "6Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "7Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "8Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "9Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "10Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "11Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "12Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "13Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "14Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "15Phone", R.mipmap.ic_launcher, 1234.34f));
            mListProducts.add(new Product(4, "16Phone", R.mipmap.ic_launcher, 1234.34f));

        }
        mRecyclerProducts = findViewById(R.id.recyclerProducts);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerProducts.setLayoutManager(linearLayoutManager);

        mAdapterProducts = new AdapterProducts(mListProducts);
        mRecyclerProducts.setAdapter(mAdapterProducts);

        mAdapterProducts.setOnProductClickListener(new MyOnProductClickListener());

    }

    private class MyOnProductClickListener implements AdapterProducts.OnProductClickListener {
        @Override
        public void onProductImageClick(AdapterProducts adapterProducts, Product product, int position, ImageView imgProduct) {
            Snackbar.make(
                    mRecyclerProducts,
                    product.getTitle(),
                    Snackbar.LENGTH_LONG
            ).show();
        }

        @Override
        public void onProductTitleClick(AdapterProducts adapterProducts, Product product, int position, TextView txtProductTitle) {
            Snackbar.make(
                    mRecyclerProducts,
                    product.getTitle() + " " + position,
                    Snackbar.LENGTH_LONG
            ).show();
        }
    }
}