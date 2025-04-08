1. Trao đổi với nhau thông qua kafka  
![1](https://github.com/user-attachments/assets/69dcab39-1e9c-4756-95d2-2c6fed12ee2b)  
2. Kafka thành cluster gồm 3 máy
![2](https://github.com/user-attachments/assets/60a5354a-9dd5-4770-8883-defc2fc706c7)
3. Dừng máy kafka leader
+ Tìm leader:   
       docker exec -it kafka1 bash    
       kafka-metadata-shell --snapshot /tmp/kraft-combined-logs/__cluster_metadata-*-snapshot    
+ Ép dừng:  
      docker stop kafka2  
+ Kiểm tra:  
     kafka-metadata-shell --snapshot /tmp/kraft-combined-logs/__cluster_metadata-*-snapshot

