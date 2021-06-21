puclic class ExecMap {


    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
    
        String FilePath = "/home/xm/Downloads/wikipedia_50GB/wikipedia_50GB/file21";
        File file = new File(FilePath);
        long splitFileSize = 64 * 1024 * 1024;
        long fileSize = file.length();
        System.out.println(+fileSize);
        int mappers = (int) (fileSize / splitFileSize);
        System.out.println(+mappers);
        ExecMap exec= new ExecMap();
        exec.mapSplit(FilePath,splitFileSize,mappers,fileSize);
    }
    
    private static void mapSplit(String FilePath, long splitlen, int mappers,long fileSize) {
    ExecutorService executor = Executors.newFixedThreadPool(1);
            executor.submit(() -> {
                long len = fileSize;
                long leninfile = 0, leng = 0;
                int count = 1, data;
                try {
                    long startTime = System.currentTimeMillis(); // Get the start Time
                    long endTime = 0;
                    System.out.println(startTime);
                    File filename = new File(FilePath);
                    InputStream infile = new BufferedInputStream(new FileInputStream(filename));
                    data = infile.read();
                    while (data != -1) {
    
                        String name = Thread.currentThread().getName();
                        System.out.println("task started: " + name +" ====Time " +System.currentTimeMillis());
                        filename = new File("/home/xm/Desktop/split/" +"Mapper " + count + ".txt");
                        OutputStream outfile = new BufferedOutputStream(new FileOutputStream(filename));
                        while (data != -1 && leng < splitlen) {
                            outfile.write(data);
                            leng++;
                            data = infile.read();
                        }
                        leninfile += leng;
                        leng = 0;
                        outfile.close();
                        count++;
                        System.out.println("task finished: " + name);
                    }
                    endTime = System.currentTimeMillis();
                    System.out.println(endTime);
                    long msec = endTime - startTime;
                    long sec = endTime - startTime;
                    System.out.println("Difference in milli seconds: " + msec); //Print the difference in mili seconds
                    System.out.println("Differencce in Seconds: " + sec / 1000);
    
    
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                executor.shutdownNow();
            });
    
    
    }
    }