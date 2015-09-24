import java.sql.Connection;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Vector;


public class ConnPool {
	private Vector buffer = new Vector();
	private static ConnPool connPool = new ConnPool();
	
	static{
		
			try {
				initConnPool();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}

	private ConnPool(){}
	
	public static void initConnPool() throws ClassNotFoundException, SQLException {
		destoryConnPool();
		Vector temp = ConnPool.getConnPool().getConnPoolBuffer();
		ConnFactory factory = ConnFactory.getDefaultFactory();
		
		for(int i=0; i<factory.getMaxConn(); i++) {
			Connection conn = factory.createConnection();
			temp.addElement(conn);
			System.out.println("New Connection Created.."+ conn);
		}
	}

	public synchronized static void destoryConnPool(){
		Vector temp = ConnPool.getConnPool().getConnPoolBuffer();
		Enumeration en = temp.elements();
		while(en.hasMoreElements()) {
			Connection conn = (Connection) en.nextElement();
			if(conn != null) {
				try{
					conn.close();
					System.out.println("Connection Closed"+ conn);
				} catch (SQLException e){
					e.printStackTrace();
				}
			}
		}
		
	}


	public static ConnPool getConnPool() {
		if(connPool == null) {
			connPool = new ConnPool();
		}
		return connPool;
	}


	public synchronized Connection getConnection() throws InterruptedException {
		while(buffer.size() == 0) {
			this.wait();
		}
		
		Connection conn = (Connection) this.buffer.remove(buffer.size() -1);
		System.out.println("Connection 대여 getConnection()"+ conn);
		return conn;
	}

	public synchronized void releaseConnection(Connection conn) {
		this.buffer.addElement(conn);
		System.out.println("Connection 반환 releaseConnection()"+ conn);
		this.notifyAll();
	}
	
	private Vector getConnPoolBuffer() {
		return this.buffer;
	}
}
