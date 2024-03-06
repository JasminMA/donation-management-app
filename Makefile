build-UnicornStockBrokerFunction:
	@ mvn clean package
	@ mkdir -p $(ARTIFACTS_DIR)/lib
	@ cp ./target/management-0.0.1-SNAPSHOT-aws.jar $(ARTIFACTS_DIR)/lib/