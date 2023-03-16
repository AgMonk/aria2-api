package com.gin.aria2.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gin.aria2.response.Aria2Response;
import lombok.Getter;
import lombok.Setter;

/**
 * @author bx002
 */
@Getter
@Setter
public class Aria2Option {
    @JsonProperty("allow-overwrite")
    String allowOverwrite;
    @JsonProperty("allow-piece-length-change")
    String allowPieceLengthChange;
    @JsonProperty("always-resume")
    String alwaysResume;
    @JsonProperty("async-dns")
    String asyncDns;
    @JsonProperty("auto-file-renaming")
    String autoFileRenaming;
    @JsonProperty("bt-enable-hook-after-hash-check")
    String btEnableHookAfterHashCheck;
    @JsonProperty("bt-enable-lpd")
    String btEnableLpd;
    @JsonProperty("bt-force-encryption")
    String btForceEncryption;
    @JsonProperty("bt-hash-check-seed")
    String btHashCheckSeed;
    @JsonProperty("bt-load-saved-metadata")
    String btLoadSavedMetadata;
    @JsonProperty("bt-max-peers")
    String btMaxPeers;
    @JsonProperty("bt-metadata-only")
    String btMetadataOnly;
    @JsonProperty("bt-min-crypto-level")
    String btMinCryptoLevel;
    @JsonProperty("bt-remove-unselected-file")
    String btRemoveUnselectedFile;
    @JsonProperty("bt-request-peer-speed-limit")
    String btRequestPeerSpeedLimit;
    @JsonProperty("bt-require-crypto")
    String btRequireCrypto;
    @JsonProperty("bt-save-metadata")
    String btSaveMetadata;
    @JsonProperty("bt-seed-unverified")
    String btSeedUnverified;
    @JsonProperty("bt-stop-timeout")
    String btStopTimeout;
    @JsonProperty("bt-tracker-connect-timeout")
    String btTrackerConnectTimeout;
    @JsonProperty("bt-tracker-interval")
    String btTrackerInterval;
    @JsonProperty("bt-tracker-timeout")
    String btTrackerTimeout;
    @JsonProperty("check-integrity")
    String checkIntegrity;
    @JsonProperty("conditional-get")
    String conditionalGet;
    @JsonProperty("connect-timeout")
    String connectTimeout;
    @JsonProperty("content-disposition-default-utf8")
    String contentDispositionDefaultUtf8;
    @JsonProperty("continue")
    String continues;
    @JsonProperty("dir")
    String dir;
    @JsonProperty("dry-run")
    String dryRun;
    @JsonProperty("enable-http-keep-alive")
    String enableHttpKeepAlive;
    @JsonProperty("enable-http-pipelining")
    String enableHttpPipelining;
    @JsonProperty("enable-mmap")
    String enableMmap;
    @JsonProperty("enable-peer-exchange")
    String enablePeerExchange;
    @JsonProperty("file-allocation")
    String fileAllocation;
    @JsonProperty("follow-metalink")
    String followMetalink;
    @JsonProperty("follow-torrent")
    String followTorrent;
    @JsonProperty("force-save")
    String forceSave;
    @JsonProperty("ftp-pasv")
    String ftpPasv;
    @JsonProperty("ftp-reuse-connection")
    String ftpReuseConnection;
    @JsonProperty("ftp-type")
    String ftpType;
    @JsonProperty("hash-check-only")
    String hashCheckOnly;
    @JsonProperty("http-accept-gzip")
    String httpAcceptGzip;
    @JsonProperty("http-auth-challenge")
    String httpAuthChallenge;
    @JsonProperty("http-no-cache")
    String httpNoCache;
    @JsonProperty("lowest-speed-limit")
    String lowestSpeedLimit;
    @JsonProperty("max-connection-per-server")
    String maxConnectionPerServer;
    @JsonProperty("max-download-limit")
    String maxDownloadLimit;
    @JsonProperty("max-file-not-found")
    String maxFileNotFound;
    @JsonProperty("max-mmap-limit")
    String maxMmapLimit;
    @JsonProperty("max-resume-failure-tries")
    String maxResumeFailureTries;
    @JsonProperty("max-tries")
    String maxTries;
    @JsonProperty("max-upload-limit")
    String maxUploadLimit;
    @JsonProperty("metalink-enable-unique-protocol")
    String metalinkEnableUniqueProtocol;
    @JsonProperty("metalink-preferred-protocol")
    String metalinkPreferredProtocol;
    @JsonProperty("min-split-size")
    String minSplitSize;
    @JsonProperty("no-file-allocation-limit")
    String noFileAllocationLimit;
    @JsonProperty("no-netrc")
    String noNetrc;
    @JsonProperty("parameterized-uri")
    String parameterizedUri;
    @JsonProperty("pause-metadata")
    String pauseMetadata;
    @JsonProperty("piece-length")
    String pieceLength;
    @JsonProperty("proxy-method")
    String proxyMethod;
    @JsonProperty("realtime-chunk-checksum")
    String realtimeChunkChecksum;
    @JsonProperty("referer")
    String referer;
    @JsonProperty("remote-time")
    String remoteTime;
    @JsonProperty("remove-control-file")
    String removeControlFile;
    @JsonProperty("retry-wait")
    String retryWait;
    @JsonProperty("reuse-uri")
    String reuseUri;
    @JsonProperty("rpc-save-upload-metadata")
    String rpcSaveUploadMetadata;
    @JsonProperty("save-not-found")
    String saveNotFound;
    @JsonProperty("seed-ratio")
    String seedRatio;
    @JsonProperty("seed-time")
    String seedTime;
    @JsonProperty("split")
    String split;
    @JsonProperty("stream-piece-selector")
    String streamPieceSelector;
    @JsonProperty("timeout")
    String timeout;
    @JsonProperty("uri-selector")
    String uriSelector;
    @JsonProperty("use-head")
    String useHead;
    @JsonProperty("user-agent")
    String userAgent;

    public static class Response extends Aria2Response<Aria2Option> {
    }


}
