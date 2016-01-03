package example.abhishek.com.materialdesign.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import example.abhishek.com.materialdesign.R;

/**
 * Created by Abhishek on 03-01-2016.
 */
public class fragment_home_adapter extends RecyclerView.Adapter<fragment_home_adapter.ViewHolderHome> {

    private LayoutInflater layoutInflater;

    public fragment_home_adapter(Context context){
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolderHome onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.custom_list_view_home, parent, false);

        ViewHolderHome viewHolderHome = new ViewHolderHome(view);

        return viewHolderHome;
    }

    @Override
    public void onBindViewHolder(ViewHolderHome holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHolderHome extends RecyclerView.ViewHolder{

        TextView topicname;
        TextView author;
        TextView content;
        TextView like;
        TextView comment;
        ImageButton buttonLike;
        ImageButton buttonComment;


        public ViewHolderHome(View itemView){
            super(itemView);

            topicname = (TextView) itemView.findViewById(R.id.home_topic_name);
            author = (TextView) itemView.findViewById(R.id.home_author_name);
            content = (TextView) itemView.findViewById(R.id.home_topic_content);
            like = (TextView) itemView.findViewById(R.id.home_button_like_text);
            comment = (TextView) itemView.findViewById(R.id.home_button_comment_text);
            buttonLike = (ImageButton) itemView.findViewById(R.id.home_button_like);
            buttonComment = (ImageButton) itemView.findViewById(R.id.home_button_comment);

        }
    }


}
