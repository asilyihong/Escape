package tw.h4.game.escape.disaster;

import android.content.Context;

public class NuclearDisaster extends Disaster {
    public enum Level {
        LEVEL_1, LEVEL_2, LEVEL_3, LEVEL_4;
    }

    /**
     * @see Disaster#getLevelCount()
     */
    public int getLevelCount() {
        int length = Level.values().length;
        return length;
    }
    /**
     * @see Disaster#getHpHit(long, double, double, long, double, double)
     */
    @Override
    public int getHpHit(long t1, double lon1, double lat1, long t2,
                        double lon2, double lat2) {
        // TODO: complete this function
        return 10;
    }

    /**
     * @see Disaster#getEscapeTime()
     */
    @Override
    public long getEscapeTime() {
        return 18000000l;
    }

    /**
     * @see Disaster#getDisasterName(android.content.Context)
     */
    @Override
    public String getDisasterName(Context ctx) {
        return "Nuclear disaster";
    }
}
