package in.bitcode.recyclerview2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterProducts extends RecyclerView.Adapter<AdapterProducts.ProductViewHolder> {

    private ArrayList<Product> mListProducts;

    public AdapterProducts(ArrayList<Product> listProducts) {
        this.mListProducts = listProducts;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.product, null);

        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        Product product = mListProducts.get(position);

        holder.mImgProduct.setImageResource(product.getImageId());
        holder.mTxtProductName.setText(product.getTitle());

    }

    @Override
    public int getItemCount() {
        return mListProducts.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImgProduct;
        public TextView mTxtProductName;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            mImgProduct = itemView.findViewById(R.id.imgProduct);
            mTxtProductName = itemView.findViewById(R.id.txtProductName);
        }
    }
}
