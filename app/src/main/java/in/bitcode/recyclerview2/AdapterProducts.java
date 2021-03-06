package in.bitcode.recyclerview2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterProducts extends RecyclerView.Adapter<AdapterProducts.ProductViewHolder> {

    private ArrayList<Product> mListProducts;

    public AdapterProducts(ArrayList<Product> listProducts) {
        this.mListProducts = listProducts;
    }


    public interface OnProductClickListener {
        public void onProductImageClick(AdapterProducts adapterProducts, Product product, int position, ImageView imgProduct);

        public void onProductTitleClick(AdapterProducts adapterProducts, Product product, int position, TextView txtProductTitle);
    }

    private OnProductClickListener mOnProductClickListener;

    public void setOnProductClickListener(OnProductClickListener onProductClickListener) {
        this.mOnProductClickListener = onProductClickListener;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ProductView productView = new ProductView(parent.getContext());
        return new ProductViewHolder(productView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        Product product = mListProducts.get(position);
        holder.mProductView.setProduct(product);

    }

    @Override
    public int getItemCount() {
        return mListProducts.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

       public ProductView mProductView;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            mProductView = (ProductView)itemView;

        }
    }

    private void ms(View view, String text) {
        Snackbar snackbar = Snackbar.make(view, text, Snackbar.LENGTH_LONG);
        snackbar.setAction("Dismiss", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        });
        snackbar.setActionTextColor(Color.YELLOW);
        snackbar.setTextColor(Color.RED);
        snackbar.show();
    }

    private void mt(Context context, String text) {
        //Toast.makeText(context, text, Toast.LENGTH_LONG).show();

    }
}
