package pramod.com.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface PersonDAO {

    @Insert
    void insert(Person p);

}
