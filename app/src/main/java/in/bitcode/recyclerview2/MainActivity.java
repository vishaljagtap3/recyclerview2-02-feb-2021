package in.bitcode.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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
        mListProducts = new ArrayList<>();
        mListProducts.add(new Product(1, "Laptop", R.mipmap.ic_launcher, 1234.34f));
        mListProducts.add(new Product(2, "Projector", R.mipmap.ic_launcher, 1234.34f));
        mListProducts.add(new Product(3, "Camera", R.mipmap.ic_launcher, 1234.34f));
        mListProducts.add(new Product(4, "Phone", R.mipmap.ic_launcher, 1234.34f));

        mRecyclerProducts = findViewById(R.id.recyclerProducts);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerProducts.setLayoutManager(linearLayoutManager);

        mAdapterProducts = new AdapterProducts(mListProducts);
        mRecyclerProducts.setAdapter(mAdapterProducts);


    }
}